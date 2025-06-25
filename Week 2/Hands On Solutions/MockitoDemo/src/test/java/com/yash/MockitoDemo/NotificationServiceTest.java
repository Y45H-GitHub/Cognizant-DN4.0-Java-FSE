package com.yash.MockitoDemo;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class NotificationServiceTest {

    @Test
    void testSendNotification_VerifyInteraction() {
        // mock of Notifier
        Notifier mockNotifier = mock(Notifier.class);
        NotificationService service = new NotificationService(mockNotifier);
        service.notifyUser("Yash");
        // Verify interaction
        verify(mockNotifier).send("Hello Yash, you have a new alert!");
    }
}
