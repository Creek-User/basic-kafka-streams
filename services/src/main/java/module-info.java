
import org.creekservice.api.platform.metadata.ComponentDescriptor;

module basic.kafka.streams.services {
    requires transitive basic.kafka.streams.api;

    exports io.github.creek.user.basic.kafka.streams.services;

    provides ComponentDescriptor with
            io.github.creek.user.basic.kafka.streams.services.ExampleServiceDescriptor;
}
