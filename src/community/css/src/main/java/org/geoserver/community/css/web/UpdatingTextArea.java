package org.geoserver.community.css.web;

import org.apache.wicket.Component;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.form.AjaxFormComponentUpdatingBehavior;
import org.apache.wicket.markup.html.form.TextArea;
import org.apache.wicket.model.IModel;

public class UpdatingTextArea extends TextArea<String> {
    public UpdatingTextArea(final String id, final IModel<String> model, final Component feedback) {
        super(id, model);
        add(new AjaxFormComponentUpdatingBehavior("onblur") {
            @Override
            protected void onUpdate(AjaxRequestTarget target) {
                target.addComponent(feedback);
            }
        });
    }
}
