package guru.leco.mongodbreactivestockquoteservice;

import guru.leco.mongodbreactivestockquoteservice.client.StockQuoteClient;
import guru.leco.mongodbreactivestockquoteservice.domain.Quote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

@Component
public class QuoteRunner implements CommandLineRunner {

    private final StockQuoteClient stockQuoteClient;

    @Autowired
    public QuoteRunner(StockQuoteClient stockQuoteClient) {
        this.stockQuoteClient = stockQuoteClient;
    }

    @Override
    public void run(String... args) throws Exception {

        Flux<Quote> quoteFlux = this.stockQuoteClient.getQuoteStream();

        quoteFlux.subscribe(System.out::println);
    }
}
