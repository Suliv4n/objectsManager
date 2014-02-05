import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.*;

import play.mvc.*;
import play.test.*;
import play.data.DynamicForm;
import play.data.validation.ValidationError;
import play.data.validation.Constraints.RequiredValidator;
import play.i18n.Lang;
import play.libs.F;
import play.libs.F.*;

import static play.test.Helpers.*;
import static org.fest.assertions.Assertions.*;


/**
*
* Simple (JUnit) tests that can call all parts of a play app.
* If you are interested in mocking a whole application, see the wiki for more details.
*
*/
public class ApplicationTest {

    @Test
    public void simpleCheck() {
        int a = 1 + 1;
        assertThat(a).isEqualTo(2);
    }

    @Test
    public void renderTemplate() {
        Content html = views.html.index.render("Your new application is ready.");
        assertThat(contentType(html)).isEqualTo("text/html");
        assertThat(contentAsString(html)).contains("Your new application is ready.");
    }
    
    @Test
	public void NomObjet(){
	Objet o = new Objet("Arme");
	assertThat(o.getNom()).isEqualTo("Arme");
    }

    @Test
	public void TailleInventaire(){
	Inventaire i = new Inventaire(20);
	assertThat(i.getTailleInventaire()).isEqualTo(20);
    }
    @Test
	public void NomObjetInventaire(){
	Inventaire i= new Inventaire(20);
	assertThat(i.getObjetInventaire(0)).isEqualTo("objet");
    }
   @Test
	public void NomObjetInventaire2(){
	Inventaire i= new Inventaire(20);
	assertThat(i.getObjetInventaire(1)).isEqualTo("objet2");
    }
    
    @Test
    public void Personne(){
		Personne p = new Personne("Bob","Inventaire");
		assertThat(p.getNom()).isEqualTo("Bob");
		assertThat(p.getInventaire()).isEqualTo("Inventaire");
	}	

}
