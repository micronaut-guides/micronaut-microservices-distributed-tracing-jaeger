package example.micronaut.bookrecommendation;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.retry.annotation.Recoverable;
import io.reactivex.Maybe;

import javax.validation.constraints.NotBlank;

@Client("http://localhost:8082")
@Recoverable(api = BookInventoryOperations.class)
public interface BookInventoryClient extends BookInventoryOperations {

    @Get("/books/stock/{isbn}")
    Maybe<Boolean> stock(@NotBlank String isbn);
}
