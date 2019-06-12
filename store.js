import { createStore, applyMiddleware } from "redux"
import thunk from "redux-thunk"
import reducer from "./reducer/index"

export const initializeStore = {
    commonInfo: {
      selectedMenu: "hero"
    },
    user: {
        jwt: null
    }
}

export default applyMiddleware(thunk)(createStore)(reducer, initializeStore)