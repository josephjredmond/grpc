// Code generated by protoc-gen-go-grpc. DO NOT EDIT.

package service

import (
	context "context"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
)

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
// Requires gRPC-Go v1.32.0 or later.
const _ = grpc.SupportPackageIsVersion7

// DatabaseServiceClient is the client API for DatabaseService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type DatabaseServiceClient interface {
	CreatePlayer(ctx context.Context, in *CreatePlayerRequest, opts ...grpc.CallOption) (*CreatePlayerResponse, error)
	GetPlayer(ctx context.Context, in *GetPlayerRequest, opts ...grpc.CallOption) (*GetPlayerResponse, error)
	UpdatePlayer(ctx context.Context, in *UpdatePlayerRequest, opts ...grpc.CallOption) (*UpdatePlayerResponse, error)
	DeletePlayer(ctx context.Context, in *DeletePlayerRequest, opts ...grpc.CallOption) (*DeletePlayerResponse, error)
}

type databaseServiceClient struct {
	cc grpc.ClientConnInterface
}

func NewDatabaseServiceClient(cc grpc.ClientConnInterface) DatabaseServiceClient {
	return &databaseServiceClient{cc}
}

func (c *databaseServiceClient) CreatePlayer(ctx context.Context, in *CreatePlayerRequest, opts ...grpc.CallOption) (*CreatePlayerResponse, error) {
	out := new(CreatePlayerResponse)
	err := c.cc.Invoke(ctx, "/service.DatabaseService/CreatePlayer", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *databaseServiceClient) GetPlayer(ctx context.Context, in *GetPlayerRequest, opts ...grpc.CallOption) (*GetPlayerResponse, error) {
	out := new(GetPlayerResponse)
	err := c.cc.Invoke(ctx, "/service.DatabaseService/GetPlayer", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *databaseServiceClient) UpdatePlayer(ctx context.Context, in *UpdatePlayerRequest, opts ...grpc.CallOption) (*UpdatePlayerResponse, error) {
	out := new(UpdatePlayerResponse)
	err := c.cc.Invoke(ctx, "/service.DatabaseService/UpdatePlayer", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *databaseServiceClient) DeletePlayer(ctx context.Context, in *DeletePlayerRequest, opts ...grpc.CallOption) (*DeletePlayerResponse, error) {
	out := new(DeletePlayerResponse)
	err := c.cc.Invoke(ctx, "/service.DatabaseService/DeletePlayer", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// DatabaseServiceServer is the server API for DatabaseService service.
// All implementations must embed UnimplementedDatabaseServiceServer
// for forward compatibility
type DatabaseServiceServer interface {
	CreatePlayer(context.Context, *CreatePlayerRequest) (*CreatePlayerResponse, error)
	GetPlayer(context.Context, *GetPlayerRequest) (*GetPlayerResponse, error)
	UpdatePlayer(context.Context, *UpdatePlayerRequest) (*UpdatePlayerResponse, error)
	DeletePlayer(context.Context, *DeletePlayerRequest) (*DeletePlayerResponse, error)
	mustEmbedUnimplementedDatabaseServiceServer()
}

// UnimplementedDatabaseServiceServer must be embedded to have forward compatible implementations.
type UnimplementedDatabaseServiceServer struct {
}

func (UnimplementedDatabaseServiceServer) CreatePlayer(context.Context, *CreatePlayerRequest) (*CreatePlayerResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method CreatePlayer not implemented")
}
func (UnimplementedDatabaseServiceServer) GetPlayer(context.Context, *GetPlayerRequest) (*GetPlayerResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetPlayer not implemented")
}
func (UnimplementedDatabaseServiceServer) UpdatePlayer(context.Context, *UpdatePlayerRequest) (*UpdatePlayerResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method UpdatePlayer not implemented")
}
func (UnimplementedDatabaseServiceServer) DeletePlayer(context.Context, *DeletePlayerRequest) (*DeletePlayerResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method DeletePlayer not implemented")
}
func (UnimplementedDatabaseServiceServer) mustEmbedUnimplementedDatabaseServiceServer() {}

// UnsafeDatabaseServiceServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to DatabaseServiceServer will
// result in compilation errors.
type UnsafeDatabaseServiceServer interface {
	mustEmbedUnimplementedDatabaseServiceServer()
}

func RegisterDatabaseServiceServer(s grpc.ServiceRegistrar, srv DatabaseServiceServer) {
	s.RegisterService(&DatabaseService_ServiceDesc, srv)
}

func _DatabaseService_CreatePlayer_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(CreatePlayerRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(DatabaseServiceServer).CreatePlayer(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/service.DatabaseService/CreatePlayer",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(DatabaseServiceServer).CreatePlayer(ctx, req.(*CreatePlayerRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _DatabaseService_GetPlayer_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetPlayerRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(DatabaseServiceServer).GetPlayer(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/service.DatabaseService/GetPlayer",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(DatabaseServiceServer).GetPlayer(ctx, req.(*GetPlayerRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _DatabaseService_UpdatePlayer_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(UpdatePlayerRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(DatabaseServiceServer).UpdatePlayer(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/service.DatabaseService/UpdatePlayer",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(DatabaseServiceServer).UpdatePlayer(ctx, req.(*UpdatePlayerRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _DatabaseService_DeletePlayer_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(DeletePlayerRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(DatabaseServiceServer).DeletePlayer(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/service.DatabaseService/DeletePlayer",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(DatabaseServiceServer).DeletePlayer(ctx, req.(*DeletePlayerRequest))
	}
	return interceptor(ctx, in, info, handler)
}

// DatabaseService_ServiceDesc is the grpc.ServiceDesc for DatabaseService service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var DatabaseService_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "service.DatabaseService",
	HandlerType: (*DatabaseServiceServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "CreatePlayer",
			Handler:    _DatabaseService_CreatePlayer_Handler,
		},
		{
			MethodName: "GetPlayer",
			Handler:    _DatabaseService_GetPlayer_Handler,
		},
		{
			MethodName: "UpdatePlayer",
			Handler:    _DatabaseService_UpdatePlayer_Handler,
		},
		{
			MethodName: "DeletePlayer",
			Handler:    _DatabaseService_DeletePlayer_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "database.proto",
}