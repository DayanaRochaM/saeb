import { createSlice } from '@reduxjs/toolkit'

export const slice = createSlice({
  name: 'store',
  initialState: {
    fetching: false,
    listaRegioes: [],
    listaUFs: [],
    listaMunicipios: [],
    listaEscolas: [],
    listaInseEscolas: []
  },
  reducers: {
    fetch: (state) => { 
      state.fetching = true;
    },
    fetchSuccess: (state, {data}) => {   
      state.fetching = false;
      if( data.listaRegioes) state.listaRegioes = data.listaRegioes; 
      if( data.listaUFs) state.listaUFs = data.listaUFs; 
      if( data.listaMunicipios) state.listaMunicipios = data.listaMunicipios; 
      if( data.listaEscolas) state.listaEscolas = data.listaEscolas; 
      if( data.listaInseEscolas) state.listaInseEscolas = data.listaInseEscolas; 
    },
    findInseEscolas: (state) => { 
      state.fetching = true;
    },
    requestFailed: (state, message) => {
        state.fetching = false;
    },
  },
})

export const { 
    fetch,
    findInseEscolas
} = slice.actions

export default slice.reducer