from concurrent.futures.thread import ThreadPoolExecutor

import grpc

from grpc_py import query_process_pb2_grpc


def serve():
    server = grpc.server(ThreadPoolExecutor(max_workers=10))
    query_process_pb2_grpc.add_QueryProcessGrpcServicer_to_server(
        query_process_pb2_grpc.QueryProcessGrpcServicer(), server)
    server.add_insecure_port('[::]:50051')
    server.start()
    server.wait_for_termination()


if __name__ == '__main__':
    serve()