package structural.registry;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.UUID;

public class Service {
    private final String serviceId;
    private final int portNumber;
    private final String applicationName;
    private final LocalDateTime startedAt;
    private final Duration runningTime;
    private final boolean isRunning;

    Service(String serviceId,int portNumber,String applicationName,LocalDateTime startedAt,Duration runningTime,boolean isRunning){
        this.serviceId=serviceId;
        this.portNumber=portNumber;
        this.applicationName=applicationName;
        this.startedAt=startedAt;
        this.runningTime=runningTime;
        this.isRunning=isRunning;
    }

    public String getServiceId() {
        return serviceId;
    }

    @Override
    public String toString() {
        return "Service{" +
                "serviceId= "+serviceId+
                ", portNumber=" + portNumber +
                ", applicationName='" + applicationName + '\'' +
                ", startedAt=" + startedAt +
                ", runningTime=" + runningTime +
                ", isRunning=" + isRunning +
                '}';
    }
}
