package com.kiroule.vaadin.bakeryapp.ui.utils.converters;

import com.kiroule.vaadin.bakeryapp.ui.dataproviders.DataProviderUtil;
import com.kiroule.vaadin.bakeryapp.ui.utils.FormattingUtils;
import com.vaadin.flow.templatemodel.ModelEncoder;

public class CurrencyFormatter implements ModelEncoder<Integer, String> {

	@Override
	public String encode(Integer modelValue) {
		return DataProviderUtil.convertIfNotNull(modelValue, FormattingUtils::formatAsCurrency);
	}

	@Override
	public Integer decode(String presentationValue) {
		throw new UnsupportedOperationException();
	}
}
