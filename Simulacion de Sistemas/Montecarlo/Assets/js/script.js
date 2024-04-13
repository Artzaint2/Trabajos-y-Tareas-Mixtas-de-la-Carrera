function calcularMonteCarlo() {
    const simulations = parseInt(document.getElementById('simulationsSlider').value);
    const lowerLimit = 2;
    const upperLimit = 3;
  

    
    // Calcular el resultado matemático de la integral
    const resultadoMatematico = calcularResultadoMatematico(lowerLimit, upperLimit);
  
    // Calcular el resultado aproximado utilizando el Método de Monte Carlo
    const resultadoMonteCarlo = calcularResultadoMonteCarlo(lowerLimit, upperLimit, simulations);
  
    // Calcular el porcentaje de error
    const porcentajeError = calcularPorcentajeError(resultadoMatematico, resultadoMonteCarlo);
  
    // Mostrar los resultados en la interfaz
    document.getElementById('resultadoMatematico').innerText = resultadoMatematico.toFixed(4);
    document.getElementById('resultadoMonteCarlo').innerText = resultadoMonteCarlo.toFixed(4);
    document.getElementById('porcentajeError').innerText = porcentajeError.toFixed(2);
    document.getElementById('results').style.display = 'block';

  }
  
  function calcularResultadoMatematico(lowerLimit, upperLimit) {
    // Calcular la integral utilizando la fórmula
    return (Math.pow(upperLimit, 3) + Math.pow(upperLimit, 2)) - (Math.pow(lowerLimit, 3) + Math.pow(lowerLimit, 2));
  }
  
  function calcularResultadoMonteCarlo(lowerLimit, upperLimit, simulations) {
    let insideCount = 0;
  
    for (let i = 0; i < simulations; i++) {
      const randomX = Math.random() * (upperLimit - lowerLimit) + lowerLimit;
      const randomY = Math.random() * (3 * Math.pow(upperLimit, 2) + 2 * upperLimit);
  
      if (randomY <= 3 * Math.pow(randomX, 2) + 2 * randomX) {
        insideCount++;
      }
    }
  
    // Área del rectángulo que contiene la integral
    const totalArea = (upperLimit - lowerLimit) * (3 * Math.pow(upperLimit, 2) + 2 * upperLimit);
  
    // Área bajo la curva (aproximación de la integral)
    const areaUnderCurve = totalArea * (insideCount / simulations);
  
    return areaUnderCurve;
  }
  
  function calcularPorcentajeError(valorReal, valorAproximado) {
    return Math.abs(((valorAproximado - valorReal) / valorReal) * 100);
  }
  
  // Asegurar que el valor del slider se muestre correctamente al cargar la página
  document.addEventListener('DOMContentLoaded', function () {
    const slider = document.getElementById('simulationsSlider');
    const sliderValue = document.getElementById('simulationsValue');
    sliderValue.innerText = slider.value;
  
    slider.addEventListener('input', function () {
      sliderValue.innerText = this.value;
    });

  });
  