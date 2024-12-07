package br.ufmg.dcc;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculadoraTest {
  
  @Test
  public void testeSoma1() {
    Calculadora calc = new Calculadora();
    int resultadoEsperado = 5;
    int resultadoRetornado = calc.soma(2,3);
    assertEquals("O resultado da soma deveria ser 5", resultadoEsperado, resultadoRetornado); // Mensagem de erro personalizada
  }

  @Test
  public void testeSoma2() {
    Calculadora calc = new Calculadora();
    assertEquals("O resultado da soma deveria ser 10", 10, calc.soma(4,6)); // Mensagem de erro personalizada
  }

  // Novo teste que verifica o bug introduzido
  @Test
  public void testeSomaComBug() {
    Calculadora calc = new Calculadora();
    // O cálculo correto seria 2 + 3 = 5, mas devido ao bug, será 6
    assertEquals("O resultado da soma com bug deveria ser 6", 6, calc.soma(2,3)); 
  }
}
