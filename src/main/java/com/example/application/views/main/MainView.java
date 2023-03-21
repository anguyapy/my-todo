/*
package com.example.application.views.main;

import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Main")
@Route(value = "")
public class MainView extends HorizontalLayout {

    private TextField name;
    private Button sayHello;

    public MainView() {
        name = new TextField("Your name");
        sayHello = new Button("Say hello");
        sayHello.addClickListener(e -> {
            Notification.show("Hello " + name.getValue());
        });
        sayHello.addClickShortcut(Key.ENTER);

        setMargin(true);
        setVerticalComponentAlignment(Alignment.END, name, sayHello);

        add(name, sayHello);
    }

}
*/
package com.example.application.views.main;

import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.textfield.TextFieldVariant;
import com.vaadin.flow.router.Route;

@Route("") 
public class MainView extends VerticalLayout { 
     
  public MainView() {

     TextField username = new TextField();
     username.setPrefixComponent(VaadinIcon.USER.create());
     username.setLabel("Username");
     username.setValue("maverick");
     add(username);

     TextField email = new TextField();
     email.setSuffixComponent(new Div(new Text("@example.com")));
     email.setLabel("Email Address");
     email.setValue("michael");
     email.addThemeVariants(TextFieldVariant.LUMO_ALIGN_RIGHT);
     email.setMaxLength(7);
     add(email);

     /*
     TextField right = new TextField();
     right.setValue("value");
     right.addThemeVariants(TextFieldVariant.LUMO_ALIGN_RIGHT);

     TextField textField = new TextField();
     textField.setLabel("Street Address");
     textField.setValue("Ruukinkatu 2");
     textField.setClearButtonVisible(true);
     textField.setPrefixComponent(VaadinIcon.MAP_MARKER.create());
     add(textField);
     */
     
     VerticalLayout todosList = new VerticalLayout(); 
     TextField taskField = new TextField(); 
     Button addButton = new Button("Agregar"); 
     addButton.addClickListener(click -> { 
      Checkbox checkbox = new Checkbox(taskField.getValue());
      todosList.add(checkbox);
     });
     addButton.addClickShortcut(Key.ENTER); 

     add( 
      new H1("Vaadin TODO"),
      todosList,
      new HorizontalLayout(
        taskField,
        addButton
      )
     );
  }
}