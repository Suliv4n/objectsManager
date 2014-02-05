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
    public void nomObjet(){
		Objet o = new Objet("Arme",15);
		assertThat(o.getNom()).isEqualTo("Arme");
    }
    
    @Test
    public void prixObjet(){
		Objet o = new Objet("Ventilateur",12);
		assertThat(o.getPrix()).isEqualTo(12);
	}
	
	@Test
	public void equipableObjet()
	{
		Objet o = new Objet("Gâteau", 5, false);
		assertThat(o.estEquipable()).isEqualTo(false);
		o = new Objet("Epée", 10, true);
		assertThat(o.estEquipable()).isEqualTo(true);
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
