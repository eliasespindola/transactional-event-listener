package com.example.demo.listener;

import com.example.demo.entity.Test;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

@Component
public class TestListener {

    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT)
    public void onSave(final Test tes) {
        System.out.println("blablablabla");
    }
}
