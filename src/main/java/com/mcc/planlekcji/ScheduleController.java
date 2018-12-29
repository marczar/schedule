package com.mcc.planlekcji;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ScheduleController {

    private Schedule p ;

    @Autowired
    private ScheduleRepository scheduleRepository;

    @Autowired
    public void setPlan(Schedule p) {
        this.p = p;
    }


    @RequestMapping("/")
    public String home() {
        return "Hello World!  \n";
    }

    @RequestMapping("/schedule/{name}")
    public ScheduleComponent scheduleComponent(@PathVariable(value="name") String name) {
        p.Schedule(name);
        //return new Plan(String.format("08:00"), String.format("plastyka"));
        return new ScheduleComponent("08:00", p.scheduleMap.get("08:00"));
    }

    @RequestMapping(path="/all")
    public Iterable<SchedulePersistence> getAllSchedules() {
        // This returns a JSON or XML with the users
        Iterable<SchedulePersistence> scheduleRepositoryAll = scheduleRepository.findAll();
        return scheduleRepositoryAll;

    }
}