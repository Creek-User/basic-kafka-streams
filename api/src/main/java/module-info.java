module basic.kafka.streams.api {
    requires transitive creek.kafka.metadata;

    exports io.github.creek.user.basic.kafka.streams.api;
    exports io.github.creek.user.basic.kafka.streams.internal to
            basic.kafka.streams.services,
            basic.kafka.streams.service;
}
