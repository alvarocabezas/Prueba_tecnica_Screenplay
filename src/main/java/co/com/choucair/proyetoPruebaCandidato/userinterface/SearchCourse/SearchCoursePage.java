package co.com.choucair.proyetoPruebaCandidato.userinterface.SearchCourse;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {

    //Elemento para verificar el registro del usuario
    public static final Target NAME_COURSE = Target.the("Texto de comfirmacion del resgistro").located(By.xpath("//*[@id=\"mainContent\"]/div/div/div[1]/div/h1"));

}

