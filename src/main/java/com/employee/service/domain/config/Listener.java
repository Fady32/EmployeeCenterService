package com.employee.service.domain.config;

import com.employee.service.domain.model.Event;
import com.employee.service.domain.model.Status;
import org.springframework.context.annotation.Configuration;
import org.springframework.statemachine.listener.StateMachineListenerAdapter;
import org.springframework.statemachine.state.State;

/**
 *
 *
 * @author Fady.Magdy
 */
@Configuration
public class Listener extends StateMachineListenerAdapter<Status, Event> {

    @Override
    public void stateChanged(State<Status, Event> from, State<Status, Event> to) {
        System.out.println("State changed to " + to.getId());
    }
}
