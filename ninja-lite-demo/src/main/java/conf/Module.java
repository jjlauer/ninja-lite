package conf;

import com.google.inject.Singleton;
import ninja.conf.FrameworkModule;
import ninja.conf.NinjaClassicModule;
import ninja.utils.NinjaProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class Module extends FrameworkModule {
    static private final Logger log = LoggerFactory.getLogger(Module.class);
    
    private final NinjaProperties ninjaProperties;

    public Module(NinjaProperties ninjaProperties) {
        this.ninjaProperties = ninjaProperties;
    }
    
    @Override
    protected void configure() {
        install(new NinjaClassicModule(ninjaProperties)
            .freemarker(false)
            .xml(false)
        );
        
        // disable annoying ehcache update checks
        //System.setProperty("net.sf.ehcache.skipUpdateCheck", "true");
        
        //install(new TemplateEngineJsonModule());
        
        //bind(TemplateEngineA.class);
        //bind(TemplateEngineB.class);
        
        //bind(ApplicationController.class);
    }

}