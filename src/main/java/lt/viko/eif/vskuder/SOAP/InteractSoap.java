package lt.viko.eif.vskuder.SOAP;

import lt.viko.eif.vskuder.client.*;
/**
 * Class for interacting with SOAP.
 */
public class InteractSoap {
    /**
     * Method to add item to library.
     *
     * @param request request
     * @return response
     */
    public AddItemToLibraryResponse addItemToLibrary(AddItemToLibraryRequest request) {
        StorePortService service = new StorePortService();
        lt.viko.eif.vskuder.client.StorePort port = service.getStorePortSoap11();
        return port.addItemToLibrary(request);
    }
    /**
     * Method to create category.
     *
     * @param request request
     * @return response
     */
    public CreateCategoryResponse createCategory(CreateCategoryRequest request) {
        StorePortService service = new StorePortService();
        lt.viko.eif.vskuder.client.StorePort port = service.getStorePortSoap11();
        return port.createCategory(request);
    }
    /**
     * Method to create developer.
     *
     * @param request request
     * @return response
     */
    public CreateDeveloperResponse createDeveloper(CreateDeveloperRequest request) {
        StorePortService service = new StorePortService();
        lt.viko.eif.vskuder.client.StorePort port = service.getStorePortSoap11();
        return port.createDeveloper(request);
    }
    /**
     * Method to create game.
     *
     * @param request request
     * @return response
     */
    public CreateGameResponse createGame(CreateGameRequest request) {
        StorePortService service = new StorePortService();
        lt.viko.eif.vskuder.client.StorePort port = service.getStorePortSoap11();
        return port.createGame(request);
    }
    /**
     * Method to create user.
     *
     * @param request request
     * @return response
     */
    public CreateUserResponse createUser(CreateUserRequest request) {
        StorePortService service = new StorePortService();
        lt.viko.eif.vskuder.client.StorePort port = service.getStorePortSoap11();
        return port.createUser(request);
    }
    /**
     * Method to get all categories.
     *
     * @param request request
     * @return response
     */
    public GetCategoriesResponse getCategories(GetCategoriesRequest request) {
        StorePortService service = new StorePortService();
        lt.viko.eif.vskuder.client.StorePort port = service.getStorePortSoap11();
        return port.getCategories(request);
    }
    /**
     * Method to get category.
     *
     * @param request request
     * @return response
     */
    public GetCategoryResponse getCategory(GetCategoryRequest request) {
        StorePortService service = new StorePortService();
        lt.viko.eif.vskuder.client.StorePort port = service.getStorePortSoap11();
        return port.getCategory(request);
    }
    /**
     * Method to get developer.
     *
     * @param request request
     * @return response
     */
    public GetDeveloperResponse getDeveloper(GetDeveloperRequest request) {
        StorePortService service = new StorePortService();
        lt.viko.eif.vskuder.client.StorePort port = service.getStorePortSoap11();
        return port.getDeveloper(request);
    }
    /**
     * Method to get developers.
     *
     * @param request request
     * @return response
     */
    public GetDevelopersResponse getDevelopers(GetDevelopersRequest request) {
        StorePortService service = new StorePortService();
        lt.viko.eif.vskuder.client.StorePort port = service.getStorePortSoap11();
        return port.getDevelopers(request);
    }
    /**
     * Method to get game.
     *
     * @param request request
     * @return response
     */
    public GetGameResponse getGame(GetGameRequest request) {
        StorePortService service = new StorePortService();
        lt.viko.eif.vskuder.client.StorePort port = service.getStorePortSoap11();
        return port.getGame(request);
    }
    /**
     * Method to get games.
     *
     * @param request request
     * @return response
     */
    public GetGamesResponse getGames(GetGamesRequest request) {
        StorePortService service = new StorePortService();
        lt.viko.eif.vskuder.client.StorePort port = service.getStorePortSoap11();
        return port.getGames(request);
    }
    /**
     * Method to get library.
     *
     * @param request request
     * @return response
     */
    public GetLibraryResponse getLibrary(GetLibraryRequest request) {
        StorePortService service = new StorePortService();
        lt.viko.eif.vskuder.client.StorePort port = service.getStorePortSoap11();
        return port.getLibrary(request);
    }
    /**
     * Method to get library user.
     *
     * @param request request
     * @return response
     */
    public GetLibraryUserResponse getLibraryUser(GetLibraryUserRequest request) {
    	StorePortService service = new StorePortService();
    	lt.viko.eif.vskuder.client.StorePort port = service.getStorePortSoap11();
    	return port.getLibraryUser(request);
    }
    /**
     * Method to get user.
     *
     * @param request request
     * @return response
     */
    public GetUserResponse getUser(GetUserRequest request) {
        StorePortService service = new StorePortService();
        lt.viko.eif.vskuder.client.StorePort port = service.getStorePortSoap11();
        return port.getUser(request);
    }
    /**
     * Method to get users.
     *
     * @param request request
     * @return response
     */
    public GetUsersResponse getUsers(GetUsersRequest request) {
        StorePortService service = new StorePortService();
        lt.viko.eif.vskuder.client.StorePort port = service.getStorePortSoap11();
        return port.getUsers(request);
    }
    /**
     * Method to remove category.
     *
     * @param request request
     * @return response
     */
    public RemoveCategoryResponse removeCategory(RemoveCategoryRequest request) {
        StorePortService service = new StorePortService();
        lt.viko.eif.vskuder.client.StorePort port = service.getStorePortSoap11();
        return port.removeCategory(request);
    }
    /**
     * Method to remove developer.
     *
     * @param request request
     * @return response
     */
    public RemoveDeveloperResponse removeDeveloper(RemoveDeveloperRequest request) {
        StorePortService service = new StorePortService();
        lt.viko.eif.vskuder.client.StorePort port = service.getStorePortSoap11();
        return port.removeDeveloper(request);
    }
    /**
     * Method to remove game.
     *
     * @param request request
     * @return response
     */
    public RemoveGameResponse removeGame(RemoveGameRequest request) {
        StorePortService service = new StorePortService();
        lt.viko.eif.vskuder.client.StorePort port = service.getStorePortSoap11();
        return port.removeGame(request);
    }
    /**
     * Method to remove item from library.
     *
     * @param request request
     * @return response
     */
    public RemoveItemFromLibraryResponse removeItemFromLibrary(RemoveItemFromLibraryRequest request) {
        StorePortService service = new StorePortService();
        lt.viko.eif.vskuder.client.StorePort port = service.getStorePortSoap11();
        return port.removeItemFromLibrary(request);
    }
    /**
     * Method to remove user.
     *
     * @param request request
     * @return response
     */
    public RemoveUserResponse removeUser(RemoveUserRequest request) {
        StorePortService service = new StorePortService();
        lt.viko.eif.vskuder.client.StorePort port = service.getStorePortSoap11();
        return port.removeUser(request);
    }
    /**
     * Method to update category.
     *
     * @param request request
     * @return response
     */
    public UpdateCategoryResponse updateCategory(UpdateCategoryRequest request) {
        StorePortService service = new StorePortService();
        lt.viko.eif.vskuder.client.StorePort port = service.getStorePortSoap11();
        return port.updateCategory(request);
    }
    /**
     * Method to update developer.
     *
     * @param request request
     * @return response
     */
    public UpdateDeveloperResponse updateDeveloper(UpdateDeveloperRequest request) {
        StorePortService service = new StorePortService();
        lt.viko.eif.vskuder.client.StorePort port = service.getStorePortSoap11();
        return port.updateDeveloper(request);
    }
    /**
     * Method to update game.
     *
     * @param request request
     * @return response
     */
    public UpdateGameResponse updateGame(UpdateGameRequest request) {
        StorePortService service = new StorePortService();
        lt.viko.eif.vskuder.client.StorePort port = service.getStorePortSoap11();
        return port.updateGame(request);
    }
    /**
     * Method to update user.
     *
     * @param request request
     * @return response
     */
    public UpdateUserResponse updateUser(UpdateUserRequest request) {
        StorePortService service = new StorePortService();
        lt.viko.eif.vskuder.client.StorePort port = service.getStorePortSoap11();
        return port.updateUser(request);
    }
}
