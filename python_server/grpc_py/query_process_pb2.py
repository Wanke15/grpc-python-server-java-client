# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: query_process.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor.FileDescriptor(
  name='query_process.proto',
  package='queryprocess',
  syntax='proto3',
  serialized_options=b'\n\035io.grpc.examples.queryprocessB\021QueryProcessProtoP\001\242\002\002QP',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n\x13query_process.proto\x12\x0cqueryprocess\"\x1a\n\tQpRequest\x12\r\n\x05query\x18\x01 \x01(\t\"I\n\nQpResponse\x12\x0c\n\x04\x63ode\x18\x01 \x01(\x05\x12 \n\x04\x64\x61ta\x18\x02 \x01(\x0b\x32\x12.queryprocess.Data\x12\x0b\n\x03msg\x18\x03 \x01(\t\"\x17\n\x04\x44\x61ta\x12\x0f\n\x07raw_dsl\x18\x01 \x01(\t2R\n\x10QueryProcessGrpc\x12>\n\x07Process\x12\x17.queryprocess.QpRequest\x1a\x18.queryprocess.QpResponse\"\x00\x42\x39\n\x1dio.grpc.examples.queryprocessB\x11QueryProcessProtoP\x01\xa2\x02\x02QPb\x06proto3'
)




_QPREQUEST = _descriptor.Descriptor(
  name='QpRequest',
  full_name='queryprocess.QpRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='query', full_name='queryprocess.QpRequest.query', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=37,
  serialized_end=63,
)


_QPRESPONSE = _descriptor.Descriptor(
  name='QpResponse',
  full_name='queryprocess.QpResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='code', full_name='queryprocess.QpResponse.code', index=0,
      number=1, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='data', full_name='queryprocess.QpResponse.data', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='msg', full_name='queryprocess.QpResponse.msg', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=65,
  serialized_end=138,
)


_DATA = _descriptor.Descriptor(
  name='Data',
  full_name='queryprocess.Data',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='raw_dsl', full_name='queryprocess.Data.raw_dsl', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=140,
  serialized_end=163,
)

_QPRESPONSE.fields_by_name['data'].message_type = _DATA
DESCRIPTOR.message_types_by_name['QpRequest'] = _QPREQUEST
DESCRIPTOR.message_types_by_name['QpResponse'] = _QPRESPONSE
DESCRIPTOR.message_types_by_name['Data'] = _DATA
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

QpRequest = _reflection.GeneratedProtocolMessageType('QpRequest', (_message.Message,), {
  'DESCRIPTOR' : _QPREQUEST,
  '__module__' : 'query_process_pb2'
  # @@protoc_insertion_point(class_scope:queryprocess.QpRequest)
  })
_sym_db.RegisterMessage(QpRequest)

QpResponse = _reflection.GeneratedProtocolMessageType('QpResponse', (_message.Message,), {
  'DESCRIPTOR' : _QPRESPONSE,
  '__module__' : 'query_process_pb2'
  # @@protoc_insertion_point(class_scope:queryprocess.QpResponse)
  })
_sym_db.RegisterMessage(QpResponse)

Data = _reflection.GeneratedProtocolMessageType('Data', (_message.Message,), {
  'DESCRIPTOR' : _DATA,
  '__module__' : 'query_process_pb2'
  # @@protoc_insertion_point(class_scope:queryprocess.Data)
  })
_sym_db.RegisterMessage(Data)


DESCRIPTOR._options = None

_QUERYPROCESSGRPC = _descriptor.ServiceDescriptor(
  name='QueryProcessGrpc',
  full_name='queryprocess.QueryProcessGrpc',
  file=DESCRIPTOR,
  index=0,
  serialized_options=None,
  create_key=_descriptor._internal_create_key,
  serialized_start=165,
  serialized_end=247,
  methods=[
  _descriptor.MethodDescriptor(
    name='Process',
    full_name='queryprocess.QueryProcessGrpc.Process',
    index=0,
    containing_service=None,
    input_type=_QPREQUEST,
    output_type=_QPRESPONSE,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_QUERYPROCESSGRPC)

DESCRIPTOR.services_by_name['QueryProcessGrpc'] = _QUERYPROCESSGRPC

# @@protoc_insertion_point(module_scope)
