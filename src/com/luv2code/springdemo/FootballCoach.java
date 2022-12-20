package com.luv2code.springdemo;

public class FootballCoach implements Coach{

    private FortuneService fortuneService;

    public FootballCoach(FortuneService myFortuneService){
        fortuneService = myFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "goal";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
    
}
