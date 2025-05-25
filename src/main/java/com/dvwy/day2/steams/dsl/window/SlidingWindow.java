package com.dvwy.day2.steams.dsl.window;

import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.Properties;

public class SlidingWindow {
    private final static Logger log = LoggerFactory.getLogger(SlidingWindow.class);
    private static String APPLICATION_NAME = "sliding-window-application";
    private static String BOOTSTRAP_SERVERS = "my-kafka:9092";
    private static String TOPIC_VIEW = "advertisement-view";
    private static String TOPIC_CLICK = "advertisement-click";
    private static String TOPIC_CLICKED = "advertisement-clicked";

    public static void main(String[] args) {

        Properties props = new Properties();
        props.put(StreamsConfig.APPLICATION_ID_CONFIG, APPLICATION_NAME);
        props.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, BOOTSTRAP_SERVERS);
        props.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass());
        props.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, Serdes.String().getClass());
        props.put(StreamsConfig.COMMIT_INTERVAL_MS_CONFIG, 5000);

    }
}