package apiClient;

public class FactoryRequest {

    public static IRequest make (String type){
        IRequest request;
        switch (type.toLowerCase()){

            case "get":
                request=new RequestGet();
                break;

            case "post":
                request=new RequestPost();
                break;

            default:
                request=new RequestGet();
                break;

        }
        return request;
    }
}
