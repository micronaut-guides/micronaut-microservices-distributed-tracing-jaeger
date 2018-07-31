//tag::packageandimports[]
package example.micronaut.bookrecommendation;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.Client;
import io.micronaut.tracing.annotation.ContinueSpan;
import io.reactivex.Flowable;
//end::packageandimports[]

//tag::harcoded[]
@Client("http://localhost:8081") // <1>
//end::harcoded[]
//tag::clazz[]
public interface BookCatalogueClient extends BookCatalogueOperations {

    @Get("/books")
    Flowable<Book> findAll();
}
//end::clazz[]