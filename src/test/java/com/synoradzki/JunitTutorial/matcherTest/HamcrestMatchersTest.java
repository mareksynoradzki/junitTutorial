package com.synoradzki.JunitTutorial.matcherTest;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;

import java.awt.Color;
import java.util.List;

import org.hamcrest.CoreMatchers;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import com.google.common.collect.Lists;
import com.synoradzki.JunitTutorial.Car;
import com.synoradzki.JunitTutorial.Human;
import com.synoradzki.JunitTutorial.Util;
import com.synoradzki.extraMatchers.LessThanOrEqual;

public class HamcrestMatchersTest {

	@Test
	public void test_own_created_matchers(){
		int actualGoalScored = 2;
		Assert.assertThat(actualGoalScored, LessThanOrEqual.lessThanOrEqual(4));
		Assert.assertThat(actualGoalScored, LessThanOrEqual.lessThanOrEqual(2));
	}
	
	@Test
	public void should_filter_human_list_to_age_greather_than() {
		// given
		Human marek = new Human("Marek", 60, 180);
		Human tomasz = new Human("tomasz", 90, 180);
		Human katarzyna = new Human("katarzyna", 12, 180);
		Integer thresholdAge = 20;
		
		// when
		List<Human> actual = Human.filterByMinAge(thresholdAge, marek, tomasz, katarzyna);

		// when
		Assert.assertThat(actual, Matchers.hasItems(marek, tomasz));
		Assert.assertThat(actual.toArray(new Human[actual.size()]), Matchers.arrayWithSize(Matchers.is(2)));
		Assert.assertThat(actual, Matchers.everyItem(Matchers.<Human>hasProperty("age", Matchers.greaterThan(thresholdAge))));
		
	}
	
	@Test
	public void should_test_anything() {
		Assert.assertThat("test",
				CoreMatchers.anything("Test który zawsze przejdzie"));
	}

	@Test
	public void should_test_any_of(){
		//given
		Car car1 = new Car("Marcedes", Color.BLUE);
		Car car2 = new Car("BMN", Color.RED);
		Car car3 = new Car("Fiat", Color.RED);
		List<Car> cars = Lists.newArrayList(car1, car2, car3);
		//when

		//narazie nic
		
		//then
		//samochodem powinien byæ merdedes albo czerwony samochod
		
		Assert.assertThat(cars, Matchers.<Car>everyItem(CoreMatchers.<Car>anyOf(Matchers.<Car>hasProperty("name",is("Marcedes")), Matchers.<Car>hasProperty("color", is(Color.RED)))));
	}
	@Test
	public void should_test_all_of(){
		Car car1 = new Car("Mercedes", Color.BLACK);
		Assert.assertThat(car1, Matchers.allOf(Matchers.hasProperty("name", is("Mercedes")), Matchers.hasProperty("color", is(Color.BLACK))));
		Assert.assertThat(car1, not(allOf(Matchers.hasProperty("name", is("Marcedes")), Matchers.hasProperty("color", is(Color.RED)))));
	}

	
}
