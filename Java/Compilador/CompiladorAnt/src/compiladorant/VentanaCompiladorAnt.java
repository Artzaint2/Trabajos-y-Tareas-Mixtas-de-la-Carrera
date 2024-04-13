
package compiladorant;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Character.isAlphabetic;
import static java.lang.Character.isDigit;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


public class VentanaCompiladorAnt extends javax.swing.JFrame {
private File archivo;
    
    public VentanaCompiladorAnt() {
        this.archivo = null;
        initComponents();
    }
    
    private String fuente = "";

    private char caracter;
    
    private void iniciarProceso(){
        String ecuacion = PanelDeTexto.getText();
        String ecuacionSinComentarios = ecuacion.replaceAll("(?:/\\*(?:[^*]|(?:\\*+[^*/]))*\\*+/)|(?://.*)","");
        String operadores[] = {"+", "-", "*","/","^"};
        String separadores[] = {"{","(","[","}",")","]"};
        String especiales[] = {"=","π",";"};
        int tabs = 0;
        int espacios = 0;
        int retornos_saltos = 0;
        
        Pattern pattern = Pattern.compile("(?:/\\*(?:[^*]|(?:\\*+[^*/]))*\\*+/)|(?://.*)");
        Matcher matcher = pattern.matcher(ecuacion);
        while (matcher.find()) {
            System.out.println(matcher.group());
            if (Comentarios.getText().length() == 0){
            Comentarios.setText(matcher.group());
            } else {
            Comentarios.append(matcher.group());
            }
        }
        
        for (int i = 0; i < ecuacionSinComentarios.length(); i++){
            caracter = ecuacionSinComentarios.charAt(i);
            
            if (buscarArray(operadores, String.valueOf(caracter))){
                CBOperadores.addItem(String.valueOf(caracter));
            }
            else if (buscarArray(separadores, String.valueOf(caracter))){
                CBSeparadores.addItem(String.valueOf(caracter));
            }
            else if (buscarArray(especiales, String.valueOf(caracter))){
                CBEspeciales.addItem(String.valueOf(caracter));
            }
            else if (isDigit(caracter)){
                CBNumeros.addItem(String.valueOf(caracter));
            }
            else if (isAlphabetic(caracter)){
                CBLetras.addItem(String.valueOf(caracter));
            }
            else if (caracter == '\t') {
                tabs += 1;
            }
            else if (caracter == ' '){
                espacios += 1;
            }
            else if (caracter == '\n' || caracter == '\b'){
                retornos_saltos += 1;
            }
            else {
                CBErrores.addItem(String.valueOf(caracter));
            }   
        }
        PanelFuenteSinEsp.setText(quitarEspacios(ecuacionSinComentarios));
        FuenteSinCom.setText(ecuacionSinComentarios.trim());
        FieldCaracteres.setText(String.valueOf(quitarEspacios(ecuacionSinComentarios).length()));
        FieldTabuladores.setText(String.valueOf(tabs));
        FieldEspacios.setText(String.valueOf(espacios));
        FieldRetornos.setText(String.valueOf(retornos_saltos)); 
    }
    
    // Busca el arreglo cambiandolo a una lista
    public static boolean buscarArray(String[] arr, String targetValue) {
	return Arrays.asList(arr).contains(targetValue);
    }
    
    public static String quitarEspacios(String s) {
        return s.replaceAll("\\s", ""); // se usa regex para quitar todos los espacios
    }
    
    public void salvarArchivo(){
       int seleccion = jFileChooser1.showSaveDialog(PanelDeTexto);
        if (seleccion == 0){
            try {
                PrintWriter writer = null;
                archivo = jFileChooser1.getSelectedFile();
                writer = new PrintWriter(archivo);
                writer.print(PanelDeTexto.getText());
                writer.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(VentanaCompiladorAnt.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
    }
    
    
    //marico el que lo lea xd
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jMenuItem4 = new javax.swing.JMenuItem();
        Pestañas = new javax.swing.JTabbedPane();
        AreaDeTrabajo = new javax.swing.JPanel();
        jScroll1 = new javax.swing.JScrollPane();
        PanelDeTexto = new javax.swing.JTextArea();
        AnalisisLexico = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Comentarios = new javax.swing.JTextArea();
        LabelComentarios = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        FuenteSinCom = new javax.swing.JTextPane();
        LabelFuenteSinCom = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        PanelFuenteSinEsp = new javax.swing.JTextPane();
        TextoFuenteSinEsp = new javax.swing.JLabel();
        LabelEspEnBlanco = new javax.swing.JLabel();
        LabelCaracteres = new javax.swing.JLabel();
        LabelRetornos = new javax.swing.JLabel();
        LabelTabuladores = new javax.swing.JLabel();
        FieldEspacios = new javax.swing.JTextField();
        FieldCaracteres = new javax.swing.JTextField();
        FieldRetornos = new javax.swing.JTextField();
        FieldTabuladores = new javax.swing.JTextField();
        LabelLetras = new javax.swing.JLabel();
        LabelNumeros = new javax.swing.JLabel();
        LabelErrores = new javax.swing.JLabel();
        CBLetras = new javax.swing.JComboBox<>();
        CBNumeros = new javax.swing.JComboBox<>();
        CBErrores = new javax.swing.JComboBox<>();
        LabelOperadores = new javax.swing.JLabel();
        LabelSeparadores = new javax.swing.JLabel();
        LabelEspeciales = new javax.swing.JLabel();
        CBOperadores = new javax.swing.JComboBox<>();
        CBSeparadores = new javax.swing.JComboBox<>();
        CBEspeciales = new javax.swing.JComboBox<>();
        MenuBar = new javax.swing.JMenuBar();
        OpcionArchivo = new javax.swing.JMenu();
        ArchivoNuevo = new javax.swing.JMenuItem();
        AbrirArchivo = new javax.swing.JMenuItem();
        Salvar = new javax.swing.JMenuItem();
        SalvarComo = new javax.swing.JMenuItem();
        OpcionAcercaDe = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        AnalisisBtn = new javax.swing.JMenuItem();

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Compilador");

        PanelDeTexto.setColumns(20);
        PanelDeTexto.setRows(5);
        jScroll1.setViewportView(PanelDeTexto);

        javax.swing.GroupLayout AreaDeTrabajoLayout = new javax.swing.GroupLayout(AreaDeTrabajo);
        AreaDeTrabajo.setLayout(AreaDeTrabajoLayout);
        AreaDeTrabajoLayout.setHorizontalGroup(
            AreaDeTrabajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScroll1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE)
        );
        AreaDeTrabajoLayout.setVerticalGroup(
            AreaDeTrabajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScroll1, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
        );

        Pestañas.addTab("Area de Trabajo", AreaDeTrabajo);

        Comentarios.setColumns(20);
        Comentarios.setRows(5);
        jScrollPane1.setViewportView(Comentarios);

        LabelComentarios.setText("Comentarios");

        FuenteSinCom.setEditable(false);
        jScrollPane3.setViewportView(FuenteSinCom);

        LabelFuenteSinCom.setText("Fuente sin Comentarios");

        PanelFuenteSinEsp.setEditable(false);
        jScrollPane4.setViewportView(PanelFuenteSinEsp);

        TextoFuenteSinEsp.setText("Fuente sin Espacios");

        LabelEspEnBlanco.setText("Espacios en Blanco");

        LabelCaracteres.setText("Caracteres");

        LabelRetornos.setText("Retornos y Saltos");

        LabelTabuladores.setText("Tabuladores");

        FieldEspacios.setEditable(false);
        FieldEspacios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldEspaciosActionPerformed(evt);
            }
        });

        FieldCaracteres.setEditable(false);
        FieldCaracteres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldCaracteresActionPerformed(evt);
            }
        });

        FieldRetornos.setEditable(false);
        FieldRetornos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldRetornosActionPerformed(evt);
            }
        });

        FieldTabuladores.setEditable(false);
        FieldTabuladores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldTabuladoresActionPerformed(evt);
            }
        });

        LabelLetras.setText("Letras");

        LabelNumeros.setText("Numeros");

        LabelErrores.setText("Errores");

        CBLetras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBLetrasActionPerformed(evt);
            }
        });

        CBNumeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBNumerosActionPerformed(evt);
            }
        });

        LabelOperadores.setText("Operadores");

        LabelSeparadores.setText("Separadores");

        LabelEspeciales.setText("Especiales");

        CBOperadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBOperadoresActionPerformed(evt);
            }
        });

        CBEspeciales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBEspecialesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AnalisisLexicoLayout = new javax.swing.GroupLayout(AnalisisLexico);
        AnalisisLexico.setLayout(AnalisisLexicoLayout);
        AnalisisLexicoLayout.setHorizontalGroup(
            AnalisisLexicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AnalisisLexicoLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(AnalisisLexicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelComentarios)
                    .addGroup(AnalisisLexicoLayout.createSequentialGroup()
                        .addGroup(AnalisisLexicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelCaracteres)
                            .addComponent(LabelEspEnBlanco)
                            .addComponent(LabelRetornos)
                            .addComponent(LabelTabuladores))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(AnalisisLexicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(FieldRetornos, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                            .addComponent(FieldTabuladores)
                            .addComponent(FieldCaracteres)
                            .addComponent(FieldEspacios)))
                    .addGroup(AnalisisLexicoLayout.createSequentialGroup()
                        .addGroup(AnalisisLexicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelLetras)
                            .addComponent(LabelNumeros)
                            .addComponent(LabelErrores))
                        .addGap(22, 22, 22)
                        .addGroup(AnalisisLexicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CBLetras, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CBNumeros, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CBErrores, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(AnalisisLexicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(AnalisisLexicoLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(AnalisisLexicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelSeparadores)
                            .addComponent(LabelEspeciales)
                            .addComponent(LabelOperadores))
                        .addGap(18, 18, 18)
                        .addGroup(AnalisisLexicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CBOperadores, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(AnalisisLexicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(CBEspeciales, 0, 256, Short.MAX_VALUE)
                                .addComponent(CBSeparadores, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(36, Short.MAX_VALUE))
                    .addGroup(AnalisisLexicoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(AnalisisLexicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(AnalisisLexicoLayout.createSequentialGroup()
                                .addGroup(AnalisisLexicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelFuenteSinCom)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33))
                            .addGroup(AnalisisLexicoLayout.createSequentialGroup()
                                .addGroup(AnalisisLexicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextoFuenteSinEsp)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))))
        );
        AnalisisLexicoLayout.setVerticalGroup(
            AnalisisLexicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AnalisisLexicoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AnalisisLexicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelComentarios)
                    .addComponent(LabelFuenteSinCom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AnalisisLexicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AnalisisLexicoLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TextoFuenteSinEsp)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AnalisisLexicoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(AnalisisLexicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelEspEnBlanco)
                            .addComponent(FieldEspacios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(AnalisisLexicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelCaracteres)
                            .addComponent(FieldCaracteres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(AnalisisLexicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FieldRetornos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelRetornos))
                        .addGap(13, 13, 13)
                        .addGroup(AnalisisLexicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FieldTabuladores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelTabuladores))))
                .addGap(27, 27, 27)
                .addGroup(AnalisisLexicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelLetras)
                    .addComponent(CBLetras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelOperadores)
                    .addComponent(CBOperadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AnalisisLexicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelSeparadores)
                    .addComponent(CBSeparadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelNumeros))
                .addGap(18, 18, 18)
                .addGroup(AnalisisLexicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelErrores)
                    .addComponent(CBErrores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelEspeciales)
                    .addComponent(CBEspeciales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        Pestañas.addTab("Lexico", AnalisisLexico);

        OpcionArchivo.setText("Archivo");

        ArchivoNuevo.setText("Nuevo");
        ArchivoNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArchivoNuevoActionPerformed(evt);
            }
        });
        OpcionArchivo.add(ArchivoNuevo);

        AbrirArchivo.setText("Abrir");
        AbrirArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirArchivoActionPerformed(evt);
            }
        });
        OpcionArchivo.add(AbrirArchivo);

        Salvar.setText("Salvar");
        Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarActionPerformed(evt);
            }
        });
        OpcionArchivo.add(Salvar);

        SalvarComo.setText("Salvar como");
        SalvarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarComoActionPerformed(evt);
            }
        });
        OpcionArchivo.add(SalvarComo);

        MenuBar.add(OpcionArchivo);

        OpcionAcercaDe.setText("Acerca De...");
        OpcionAcercaDe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OpcionAcercaDeMouseClicked(evt);
            }
        });
        OpcionAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcionAcercaDeActionPerformed(evt);
            }
        });
        MenuBar.add(OpcionAcercaDe);

        jMenu1.setText("Analisis");

        AnalisisBtn.setText("Realizar Analisis");
        AnalisisBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnalisisBtnActionPerformed(evt);
            }
        });
        jMenu1.add(AnalisisBtn);

        MenuBar.add(jMenu1);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pestañas)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pestañas)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void FieldEspaciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldEspaciosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldEspaciosActionPerformed

    private void FieldCaracteresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldCaracteresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldCaracteresActionPerformed

    private void FieldRetornosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldRetornosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldRetornosActionPerformed

    private void FieldTabuladoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldTabuladoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldTabuladoresActionPerformed

    private void CBEspecialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBEspecialesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBEspecialesActionPerformed

    private void AbrirArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirArchivoActionPerformed
        int seleccion = jFileChooser1.showOpenDialog(AbrirArchivo);
        if (seleccion == 0){
            try {
                BufferedReader reader = null;
                archivo = jFileChooser1.getSelectedFile();
                reader = new BufferedReader(new FileReader(archivo));
                String cadena = reader.readLine();
                while (cadena != null){
                    PanelDeTexto.append(cadena + "\n");
                    cadena = reader.readLine();
                }
                reader.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(VentanaCompiladorAnt.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(VentanaCompiladorAnt.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_AbrirArchivoActionPerformed

    private void SalvarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarComoActionPerformed
        salvarArchivo();
    }//GEN-LAST:event_SalvarComoActionPerformed

    private void SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarActionPerformed
        if (archivo == null) {
            salvarArchivo();
        } else {
            try {
                PrintWriter writer = null;
                writer = new PrintWriter(archivo);
                writer.print(PanelDeTexto.getText());
                writer.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(VentanaCompiladorAnt.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_SalvarActionPerformed

    private void ArchivoNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArchivoNuevoActionPerformed
        PanelDeTexto.setText("");
        archivo = null;
        CBOperadores.removeAllItems();
        CBSeparadores.removeAllItems();
        CBEspeciales.removeAllItems();
        CBNumeros.removeAllItems();
        CBLetras.removeAllItems();
        CBErrores.removeAllItems();
        fuente = PanelDeTexto.getText();
        fuente = fuente.trim();
        FieldCaracteres.setText("");
        PanelFuenteSinEsp.setText("");
        PanelFuenteSinEsp.setText("");
        FuenteSinCom.setText("");
        FieldCaracteres.setText("");
        FieldTabuladores.setText("");
        FieldEspacios.setText("");
        FieldRetornos.setText(""); 
        Comentarios.setText("");
    }//GEN-LAST:event_ArchivoNuevoActionPerformed

    private void AnalisisBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnalisisBtnActionPerformed
        CBOperadores.removeAllItems();
        CBSeparadores.removeAllItems();
        CBEspeciales.removeAllItems();
        CBNumeros.removeAllItems();
        CBLetras.removeAllItems();
        CBErrores.removeAllItems();
        fuente = PanelDeTexto.getText();
        fuente = fuente.trim();
        FieldCaracteres.setText("");
        PanelFuenteSinEsp.setText("");
        Comentarios.setText("");
        if(fuente.length() == 0){
        	JOptionPane.showMessageDialog(null, "El cuadro de entrada no contiene caracteres a"
                + " evaluar. ");
    	}
        else{
            iniciarProceso();
            Pestañas.setSelectedIndex(1);
        }
    }//GEN-LAST:event_AnalisisBtnActionPerformed

    private void CBLetrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBLetrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBLetrasActionPerformed

    private void CBOperadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBOperadoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBOperadoresActionPerformed

    private void CBNumerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBNumerosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBNumerosActionPerformed

    private void OpcionAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcionAcercaDeActionPerformed
        
    }//GEN-LAST:event_OpcionAcercaDeActionPerformed

    private void OpcionAcercaDeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OpcionAcercaDeMouseClicked
        JOptionPane.showMessageDialog(null, "Programa realizado por:\n"
               + "Walter Raleigh.\n"
               + "Enrique Hidalgo.", "Sobre el programa", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_OpcionAcercaDeMouseClicked

   
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaCompiladorAnt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCompiladorAnt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCompiladorAnt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCompiladorAnt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCompiladorAnt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AbrirArchivo;
    private javax.swing.JMenuItem AnalisisBtn;
    private javax.swing.JPanel AnalisisLexico;
    private javax.swing.JMenuItem ArchivoNuevo;
    private javax.swing.JPanel AreaDeTrabajo;
    private javax.swing.JComboBox<String> CBErrores;
    private javax.swing.JComboBox<String> CBEspeciales;
    private javax.swing.JComboBox<String> CBLetras;
    private javax.swing.JComboBox<String> CBNumeros;
    private javax.swing.JComboBox<String> CBOperadores;
    private javax.swing.JComboBox<String> CBSeparadores;
    private javax.swing.JTextArea Comentarios;
    private javax.swing.JTextField FieldCaracteres;
    private javax.swing.JTextField FieldEspacios;
    private javax.swing.JTextField FieldRetornos;
    private javax.swing.JTextField FieldTabuladores;
    private javax.swing.JTextPane FuenteSinCom;
    private javax.swing.JLabel LabelCaracteres;
    private javax.swing.JLabel LabelComentarios;
    private javax.swing.JLabel LabelErrores;
    private javax.swing.JLabel LabelEspEnBlanco;
    private javax.swing.JLabel LabelEspeciales;
    private javax.swing.JLabel LabelFuenteSinCom;
    private javax.swing.JLabel LabelLetras;
    private javax.swing.JLabel LabelNumeros;
    private javax.swing.JLabel LabelOperadores;
    private javax.swing.JLabel LabelRetornos;
    private javax.swing.JLabel LabelSeparadores;
    private javax.swing.JLabel LabelTabuladores;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenu OpcionAcercaDe;
    private javax.swing.JMenu OpcionArchivo;
    private javax.swing.JTextArea PanelDeTexto;
    private javax.swing.JTextPane PanelFuenteSinEsp;
    private javax.swing.JTabbedPane Pestañas;
    private javax.swing.JMenuItem Salvar;
    private javax.swing.JMenuItem SalvarComo;
    private javax.swing.JLabel TextoFuenteSinEsp;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScroll1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
