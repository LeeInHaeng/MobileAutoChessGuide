import { initializeStore } from "../store"
import { SET_USER_INFORMATION } from "../action/user"

const initialState = {
  jwt: null
}

function user(state = initializeStore === undefined ? initialState : initializeStore, action) {
  switch (action.type) {
    case SET_USER_INFORMATION: {
      return {
        ...state,
        ...action.payload
      }
    }
    default:
      return state
  }
}

export default user
