package guru.leco.mongodbreactivestockquoteservice.repositories;

import guru.leco.mongodbreactivestockquoteservice.domain.Quote;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface QuoteRepository extends ReactiveMongoRepository<Quote, String> {
}
