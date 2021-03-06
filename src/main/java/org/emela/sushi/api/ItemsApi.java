/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.3.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.emela.sushi.api;

import org.emela.sushi.model.ErrorModel;
import org.emela.sushi.model.ItemDetailRequest;
import org.emela.sushi.model.ItemDetailResponse;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-12T21:47:58.540008-04:00[America/New_York]")

@Validated
@Api(value = "items", description = "the items API")
public interface ItemsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @ApiOperation(value = "retrieves one item randomly", nickname = "retrieveItem", notes = "This endpoint randomly picks one item from the list", response = ItemDetailResponse.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ItemDetailResponse.class),
        @ApiResponse(code = 400, message = "Bad Request", response = ErrorModel.class),
        @ApiResponse(code = 401, message = "Unauthorized, Invalid or Missing Access Token", response = ErrorModel.class),
        @ApiResponse(code = 403, message = "Access Denied, Insufficient Scope privilege Or Expired Access Token", response = ErrorModel.class),
        @ApiResponse(code = 404, message = "Resource Not Found", response = ErrorModel.class),
        @ApiResponse(code = 429, message = "Too Many Requests", response = ErrorModel.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = ErrorModel.class),
        @ApiResponse(code = 200, message = "Server Errors", response = ErrorModel.class) })
    @RequestMapping(value = "/items",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<ItemDetailResponse> retrieveItem() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"item\" : {    \"name\" : \"name\"  },  \"item-id\" : \"item-id\"}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "saves list of items", nickname = "saveItems", notes = "This endpoint saves the list of items.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation"),
        @ApiResponse(code = 400, message = "Bad Request", response = ErrorModel.class),
        @ApiResponse(code = 401, message = "Unauthorized, Invalid or Missing Access Token", response = ErrorModel.class),
        @ApiResponse(code = 403, message = "Access Denied, Insufficient Scope privilege Or Expired Access Token", response = ErrorModel.class),
        @ApiResponse(code = 404, message = "Resource Not Found", response = ErrorModel.class),
        @ApiResponse(code = 429, message = "Too Many Requests", response = ErrorModel.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = ErrorModel.class),
        @ApiResponse(code = 200, message = "Server Errors", response = ErrorModel.class) })
    @RequestMapping(value = "/items",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> saveItems(@ApiParam(value = ""  )   @RequestBody ItemDetailRequest itemDetailRequest) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
