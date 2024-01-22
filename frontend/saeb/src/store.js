import { configureStore } from '@reduxjs/toolkit';
import createSagaMiddleware from 'redux-saga';

import reducer from './redux';  

import sagas from './sagas';

const sagaMiddleware = createSagaMiddleware()

export const store = configureStore({
    reducer: {
        sagas: reducer,
    },
    middleware: (getDefaultMiddleware) => getDefaultMiddleware().concat(sagaMiddleware),
})

sagaMiddleware.run(sagas); 