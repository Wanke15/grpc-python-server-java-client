package io.grpc.examples.queryprocess;

import io.grpc.Channel;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.logging.Logger;

public class QueryProcessClient {
    private static final Logger logger = Logger.getLogger(QueryProcessClient.class.getName());

    private final QueryProcessGrpcGrpc.QueryProcessGrpcBlockingStub blockingStub;

    public QueryProcessClient(Channel channel) {
        blockingStub = QueryProcessGrpcGrpc.newBlockingStub(channel);
        logger.info("Blocking stub initialized");
    }

    public QpResponse getQp(String query) {

        QpRequest request = QpRequest.newBuilder().setQuery(query).build();

        QpResponse response;
        response = blockingStub.process(request);
        System.err.println(response.getData());
        return response;
    }

    public static void main(String[] args) {
        String target = "localhost:50051";
        ManagedChannel channel = ManagedChannelBuilder.forTarget(target).usePlaintext().build();
        QueryProcessClient client = new QueryProcessClient(channel);
        client.getQp("hello");

    }
}
