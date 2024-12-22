package com.luiz.application.views.about;

import org.vaadin.lineawesome.LineAwesomeIconUrl;

import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Margin;

@PageTitle("About")
@Route("about")
@Menu(order = 1, icon = LineAwesomeIconUrl.FILE)
public class AboutView extends VerticalLayout {

    public AboutView() {
        setSpacing(false);

        Image img = new Image("images/perfil-arredondado.png", "Por hoje é só");
        img.setWidth("200px");
        add(img);

        H2 header = new H2("Por hoje é só :)");
        header.addClassNames(Margin.Top.XLARGE, Margin.Bottom.MEDIUM);
        add(header);
        Paragraph paragraph = new Paragraph("Em breve subindo novos updates, me acompanhe no ");
        Anchor linkedinLink = new Anchor("https://www.linkedin.com/in/luiz-henrique-coelho/", "Meu LinkedIn");
        linkedinLink.setTarget("_blank"); // Abre o link em uma nova aba

        paragraph.add(linkedinLink);
        add(paragraph);

        setSizeFull();
        setJustifyContentMode(JustifyContentMode.CENTER);
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        getStyle().set("text-align", "center");
    }

}
