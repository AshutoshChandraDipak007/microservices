package com.org.spring.scheduler;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import lombok.extern.log4j.Log4j2;

@SpringBootApplication
@EnableScheduling
@Log4j2
public class SpringSchedulerDemo {

	public static void main(String[] args) {
		SpringApplication.run(SpringSchedulerDemo.class, args);		
	}

//	The following is a sample code that shows how to execute the task every 
//	minute starting at 9:00 AM and ending at 9:59 AM, every day
	
	@Scheduled(cron = "0 * 9 * * ?")
	public void cronJobSch() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		Date now = new Date();
		String strDate = sdf.format(now);
		log.debug("Java cron job expression:: " + strDate);
		log.trace("Java cron job expression:: " + strDate);
        log.debug("Java cron job expression:: " + strDate);
        log.info("Java cron job expression:: " + strDate);
        log.warn("Java cron job expression:: " + strDate);
        log.error("Java cron job expression:: " + strDate);
	}

//	Fixed Rate
//	Fixed Rate scheduler is used to execute the tasks at the specific time.
//	It does not wait for the completion of previous task. The values should be in milliseconds. 
//	The sample code is shown here −
//	
	@Scheduled(fixedRate = 1000)
	public void fixedRateSch() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		Date now = new Date();
		String strDate = sdf.format(now);
		//System.out.println("Fixed Rate scheduler:: " + strDate);
		log.debug("Fixed Rate scheduler:: " + strDate);
		log.trace("Fixed Rate scheduler:: " + strDate);
        log.debug("Fixed Rate scheduler:: " + strDate);
        log.info("Fixed Rate scheduler:: " + strDate);
        log.warn("Fixed Rate scheduler:: " + strDate);
        log.error("Fixed Rate scheduler:: " + strDate);
	}

//	Fixed Delay
//	Fixed Delay scheduler is used to execute the tasks at a specific time. 
//	It should wait for the previous task completion. The values should be in milliseconds. 
//	A sample code is shown here −
//	Here, the initialDelay is the time after which the task will be executed the 
//	first time after the initial delay value.
//	An example to execute the task for every second after 
//	3 seconds from the application startup has been completed is shown below −

	@Scheduled(fixedDelay = 1000, initialDelay = 3000)
	public void fixedDelaySch() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		Date now = new Date();
		String strDate = sdf.format(now);
		log.debug("Fixed Delay scheduler:: " + strDate);
		log.trace("Fixed Delay scheduler:: " + strDate);
        log.debug("Fixed Delay scheduler:: " + strDate);
        log.info("Fixed Delay scheduler:: " + strDate);
        log.warn("Fixed Delay scheduler:: " + strDate);
        log.error("Fixed Delay scheduler:: " + strDate);
		System.out.println("");
		System.out.println("");		
	}
	
	
}
