package com.luiz.application.util;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class CustomUtils {
	public static BigDecimal calcularValorTotal(final int quantidade, final BigDecimal valorUnitario) {
		if (quantidade < 0 || valorUnitario == null || valorUnitario.compareTo(BigDecimal.ZERO) < 0) {
			throw new IllegalArgumentException("Quantidade ou valor unitário inválido");
		}
		return valorUnitario.multiply(BigDecimal.valueOf(quantidade));
	}
	public static String formataValor(BigDecimal valor) {
	    NumberFormat formatador = NumberFormat.getCurrencyInstance(Locale.of("pt", "BR"));
	    return formatador.format(valor);
	}
}
