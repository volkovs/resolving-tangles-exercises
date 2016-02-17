package order;

import java.math.BigDecimal;

import calc.DiscountCalculatorImpl;

public class OrderService {
	
	private DiscountCalculator discountCalculator = new DiscountCalculatorImpl();

	public BigDecimal proposeDiscount(Order order) {
		return discountCalculator.calculatreDiscount(order);
	}
	
	public static void main(String... args) {
		
		// Application configuration
//		Injector injector = Guice.createInjector(new AbstractModule(){
//			@Override
//			protected void configure() {
//				bind(DiscountCalculator.class).to(DiscountCalculatorImpl.class);
//			}});
        
        OrderService orderService = new OrderService();
		
		BigDecimal discount = orderService.proposeDiscount(new Order());
		System.out.println(discount);
	}
	
	
}
