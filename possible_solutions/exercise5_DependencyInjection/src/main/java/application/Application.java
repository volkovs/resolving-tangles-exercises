package application;

import java.math.BigDecimal;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

import calc.DiscountCalculatorImpl;
import order.DiscountCalculator;
import order.Order;
import order.OrderService;

public class Application {

	public static void main(String... args) {

		// Application configuration
		Injector injector = Guice.createInjector(new AbstractModule() {
			@Override
			protected void configure() {
				bind(DiscountCalculator.class).to(DiscountCalculatorImpl.class);
			}
		});

		// OrderService orderService = new OrderService();
		OrderService orderService = injector.getInstance(OrderService.class);

		BigDecimal discount = orderService.proposeDiscount(new Order());
		System.out.println(discount);
	}

}
