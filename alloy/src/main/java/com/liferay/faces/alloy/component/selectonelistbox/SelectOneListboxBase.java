/**
 * Copyright (c) 2000-2015 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
package com.liferay.faces.alloy.component.selectonelistbox;
//J-

import javax.annotation.Generated;
import javax.faces.component.html.HtmlSelectOneListbox;

import com.liferay.faces.util.component.Styleable;

/**
 * @author	Bruno Basto
 * @author	Kyle Stiemann
 */
@Generated(value = "com.liferay.alloy.tools.builder.FacesBuilder")
public abstract class SelectOneListboxBase extends HtmlSelectOneListbox implements Styleable {

	// Public Constants
	public static final String COMPONENT_TYPE = "com.liferay.faces.alloy.component.selectonelistbox.SelectOneListbox";
	public static final String RENDERER_TYPE = "com.liferay.faces.alloy.component.selectonelistbox.internal.SelectOneListboxRenderer";

	// Protected Enumerations
	protected enum SelectOneListboxPropertyKeys {
		styleClass
	}

	public SelectOneListboxBase() {
		super();
		setRendererType(RENDERER_TYPE);
	}

	@Override
	public String getStyleClass() {
		// getStateHelper().eval(SelectOneListboxPropertyKeys.styleClass, null) is called because super.getStyleClass() may return the
		// STYLE_CLASS_NAME of the super class.
		String styleClass = (String) getStateHelper().eval(SelectOneListboxPropertyKeys.styleClass, null);

		return com.liferay.faces.util.component.ComponentUtil.concatCssClasses(styleClass, "alloy-select-one-listbox");
	}

	@Override
	public void setStyleClass(String styleClass) {
		getStateHelper().put(SelectOneListboxPropertyKeys.styleClass, styleClass);
	}
}
//J+
