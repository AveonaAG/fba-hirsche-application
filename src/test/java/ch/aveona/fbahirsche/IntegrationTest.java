package ch.aveona.fbahirsche;

import ch.aveona.fbahirsche.config.AsyncSyncConfiguration;
import ch.aveona.fbahirsche.config.EmbeddedElasticsearch;
import ch.aveona.fbahirsche.config.EmbeddedSQL;
import ch.aveona.fbahirsche.config.JacksonConfiguration;
import ch.aveona.fbahirsche.config.TestSecurityConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(
    classes = { FbaHirscheApp.class, JacksonConfiguration.class, AsyncSyncConfiguration.class, TestSecurityConfiguration.class }
)
@EmbeddedElasticsearch
@EmbeddedSQL
public @interface IntegrationTest {
}
