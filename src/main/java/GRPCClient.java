//$Id$


import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;


import com.Analogy.grpc.AnalogyGrpc;
import com.Analogy.grpc.AnalogyGrpc.AnalogyStub;
import com.Analogy.grpc.AnalogyOuterClass.AnalogyLogMessage;
import com.Analogy.grpc.AnalogyOuterClass.AnalogyMessageReply;;
public class GRPCClient {

	public static void main(String[] args){
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 6000).build();
		
		AnalogyStub stub = AnalogyGrpc.newStub(channel);
		AnalogyLogMessage msg= AnalogyLogMessage.newBuilder().setText("test message from Java").setLevel("Information").build();
		StreamObserver<AnalogyMessageReply> responseObserver = new StreamObserver<AnalogyMessageReply>()
				{
			@Override
			    public void onNext(AnalogyMessageReply reply) {
			   
			    }

			    @Override
			    public void onError(Throwable t) {
			     
			    }

			    @Override
			    public void onCompleted() {
			      
			    }
			  };
		StreamObserver<AnalogyLogMessage> stream=	stub.subscribeForSendMessages(responseObserver);
		stream.onNext(msg);
		
	}
}
