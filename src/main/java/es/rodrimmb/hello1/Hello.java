package es.rodrimmb.hello1;

import lombok.Data;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
@Data
public class Hello {

    private String name;

}
