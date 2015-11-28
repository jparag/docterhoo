package hoo.docter.annots;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.util.Set;

import org.reflections.Reflections;

public class Docessor {

	private Docessor(){}
	
	public static void generateDocument(String packageName){
		Reflections reflections = new Reflections(packageName);
		Set<Class<?>> clazz = reflections.getTypesAnnotatedWith(Doctent.class);
		
	}
	
	
	public static String readAnnotation (AnnotatedElement element) throws Exception{
		
		Annotation[] annotations = element.getAnnotations();
		for(Annotation annotation : annotations){
			if(annotation instanceof Doctent){
				Doctent doctent = (Doctent)annotation;
				System.out.println(doctent.doc());
			}
		}
	}
	
	
}
