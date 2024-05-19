package org.example.LowLevelDesignSystemExample.DesignLinkedin.ClassDiagram.SocialInteraction;

import org.example.LowLevelDesignSystemExample.DesignLinkedin.ClassDiagram.Utility.ConnectionInviteStatus;
import User;

public class ConnectionInvitation {
    User sender;
    User recipients;
    String dateCreated;
    ConnectionInviteStatus status;

    boolean acceptConnection(){
        return true;
    }
    boolean rejectConnection(){
        return true;
    }
}
