package com.practiceActivity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


//will register this bean id (thatSillyCoach)automatically
@Component
public class TennisCoach implements Coach {

    //field injection. When used there's no need for setter, method or constructor injection
    @Autowired
    @Qualifier("wiseFortunes")
    FortuneTeller fortuneTeller;

   public TennisCoach(){
       System.out.println("Inside empty constructor");

    }

    // define a setter method
	/*
	@Autowired
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println(">> TennisCoach: inside setFortuneService() method");
		this.fortuneService = theFortuneService;
	}
	*/

	/*
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	*/

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

   @Override
    public String getDailyFortune() {
        return fortuneTeller.getFortune();
    }
}
