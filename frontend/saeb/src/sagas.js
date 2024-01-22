import { call, put, takeEvery, takeLatest } from 'redux-saga/effects';
import {create} from 'apisauce';

const apiFolha = create({
    baseURL: 'http://localhost:8080/saeb',
    timeout: 100000000
});

function* fetch(action) {
    try {
        const {data} = yield call(() => apiFolha.get(`/fetch`)); 
        yield put({ type: 'store/fetchSuccess', data});
    } catch (e) {
        yield put({ type: 'store/requestFailed', message: e.message });
    }
}

function* fetchInseEscolas(action) {
    try {
        let inseFilter = action.payload; 
        const {data} = yield call(() => apiFolha.post(`/inse`, inseFilter)); 
        yield put({ type: 'store/fetchSuccess', data});
    } catch (e) {
        yield put({ type: 'inep/requestFailed', message: e.message });
    }
}

function* consolidadosSagas() {
    yield takeLatest('store/fetch', fetch);
    yield takeLatest('store/findInseEscolas',fetchInseEscolas);
}
  
export default consolidadosSagas;