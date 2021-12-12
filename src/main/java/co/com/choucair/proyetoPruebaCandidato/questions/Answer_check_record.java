package co.com.choucair.proyetoPruebaCandidato.questions;

import co.com.choucair.proyetoPruebaCandidato.userinterface.SearchCourse.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer_check_record implements Question<Boolean> {

    private String verified_record;

    public Answer_check_record(String verified_record) {
        this.verified_record = verified_record;
    }

    public static Answer_check_record toThe(String verified_record) {
        return new Answer_check_record(verified_record);
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameCourse = Text.of(SearchCoursePage.NAME_COURSE).viewedBy(actor).asString();
        if (verified_record.equals(nameCourse)){
            result = true;
        }else {
            result = false;
        }
        return result;
    }

}
