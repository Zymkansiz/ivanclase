
import com.ah.aguilar_hernandez.WebApConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
public class WebAp extends AbstractAnnotationConfigDispatcherServletInitializer {


@Override
protected Class<?>[] getRootConfigClasses() {
return new Class<?>[0];
}
@Override
protected Class<?>[] getServletConfigClasses() {
return new Class<?>[]{WebApConfig.class};
}
@Override
protected String[] getServletMappings() {
return new String[]{"/servicios/*"};
}

}