package com.luiz.application.components;

import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.data.binder.ValidationException;

public class CustomBinder<T> extends Binder<T>{

    public CustomBinder(final T bean) {
        setBean(bean);
    }

    /*Por padrão, o Binder exige que erros de validação sejam tratados manualmente, o que pode tornar o código mais verboso.
     * O metodo sobrescrito encapsula toda chamada de uma ValidationException em uma RuntimeException.*/
    @Override
    public void writeBean(final T t) {
        try{
            super.writeBean(t);
        } catch (final ValidationException ex) {
            throw new RuntimeException(ex);
        }
    }

    /*facilita o acesso ao objeto associado ao Binder, garantindo que o campo do form traga e reflita sempre o objeto atualizado.
     * Ele chama writeBean(getBean()) antes de retornar o objeto, garantindo que:
		- As alterações feitas nos campos da interface sejam aplicadas ao objeto.
		- O objeto retornado esteja atualizado.*/
    public T getObject() {
        writeBean(getBean());
        return getBean();
    }
}

