package com.luiz.application.components;

import org.vaadin.firitin.components.button.VButton;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;


public class CustomButton extends VButton{
	  public CustomButton() {
	    }

	    public CustomButton(final Component icon, final ComponentEventListener<ClickEvent<Button>> clickListener) {
	        super(icon, clickListener);
	    }

	    public CustomButton(final Icon icon, final BasicClickListener clickListener) {
	        super(icon, clickListener);
	    }

	    public CustomButton(final Icon icon, final ComponentEventListener<ClickEvent<Button>> clickListener) {
	        super(icon, clickListener);
	    }

	    public CustomButton(final Icon icon) {
	        super(icon);
	    }

	    public CustomButton(final VaadinIcon icon, final BasicClickListener clickListener) {
	        super(icon, clickListener);
	    }

	    public CustomButton(final VaadinIcon icon, final ComponentEventListener<ClickEvent<Button>> clickListener) {
	        super(icon, clickListener);
	    }

	    public CustomButton(final VaadinIcon icon) {
	        super(icon);
	    }

	    public CustomButton(final String text, final Icon icon, final ComponentEventListener<ClickEvent<Button>> clickListener) {
	        super(text, icon, clickListener);
	    }

	    public CustomButton(final String text, final VaadinIcon icon, final ComponentEventListener<ClickEvent<Button>> clickListener) {
	        super(text, icon, clickListener);
	    }

	    public CustomButton(final Icon icon, final String text, final ComponentEventListener<ClickEvent<Button>> clickListener) {
	        super(icon, text, clickListener);
	    }

	    public CustomButton(final VaadinIcon icon, final String text, final ComponentEventListener<ClickEvent<Button>> clickListener) {
	        super(icon, text, clickListener);
	    }

	    public CustomButton(final String text, final Icon icon, final BasicClickListener clickListener) {
	        super(text, icon, clickListener);
	    }

	    public CustomButton(final String text, final VaadinIcon icon, final BasicClickListener clickListener) {
	        super(text, icon, clickListener);
	    }

	    public CustomButton(final String text, final VaadinIcon icon) {
	        super(text, icon);
	    }

	    public CustomButton(final String text, final Icon icon) {
	        super(text, icon);
	    }

	    public CustomButton(final VaadinIcon icon, final String text) {
	        super(icon, text);
	    }

	    public CustomButton(final Icon icon, final String text) {
	        super(icon, text);
	    }

	    public CustomButton(final String text, final ComponentEventListener<ClickEvent<Button>> clickListener) {
	        super(text, clickListener);
	    }

	    public CustomButton(final String text, final BasicClickListener clickListener) {
	        super(text, clickListener);
	    }

	    public CustomButton(final String text) {
	        super(text);
	    }

	    public CustomButton themeSmall() {
	        addThemeVariants(ButtonVariant.LUMO_SMALL);
	        return this;
	    }

	    public CustomButton themeLarge() {
	        addThemeVariants(ButtonVariant.LUMO_LARGE);
	        return this;
	    }

	    public CustomButton themeTertiary() {
	        addThemeVariants(ButtonVariant.LUMO_TERTIARY);
	        return this;
	    }

	    public CustomButton themeTertiaryInline() {
	        addThemeVariants(ButtonVariant.LUMO_TERTIARY_INLINE);
	        return this;
	    }

	    public CustomButton themePrimary() {
	        addThemeVariants(ButtonVariant.LUMO_PRIMARY);
	        return this;
	    }

	    public CustomButton themeSuccess() {
	        addThemeVariants(ButtonVariant.LUMO_SUCCESS);
	        return this;
	    }

	    public CustomButton themeWarning() {
	        addThemeVariants(ButtonVariant.LUMO_WARNING);
	        return this;
	    }

	    public CustomButton themeError() {
	        addThemeVariants(ButtonVariant.LUMO_ERROR);
	        return this;
	    }

	    public CustomButton themeContrast() {
	        addThemeVariants(ButtonVariant.LUMO_CONTRAST);
	        return this;
	    }

	    public CustomButton themeIcon() {
	        addThemeVariants(ButtonVariant.LUMO_ICON);
	        return this;
	    }
}
