import { initializeStore } from "../store"
import { SET_SELECTED_MENU } from "../action/commonInfo"

const initialState = {
  selectedMenu: "hero"
}

function commonInfo(state = initializeStore === undefined ? initialState : initializeStore, action) {
  switch (action.type) {
    case SET_SELECTED_MENU: {
      return {
        ...state,
        selectedMenu: action.selectedMenu
      }
    }
    default:
      return state
  }
}

export default commonInfo