import { combineReducers } from 'redux'
import user from './user.js'
import commonInfo from './commonInfo'

export default combineReducers({
  user,
  commonInfo
})