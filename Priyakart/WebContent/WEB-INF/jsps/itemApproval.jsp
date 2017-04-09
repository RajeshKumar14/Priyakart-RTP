<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
 <meta charset="utf-8">
   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
   <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
   <title>Item Approval</title>
  <%@include file="sellerHeader.jsp" %>
<table class="table">
    <thead>
        <tr>
            <th>#</th>
			<th>Name</th>
			<th>Type</th>
			<th>Sub-Type</th>
			<th>B-Name</th>
			<th>MRP</th>
			<th>T-Date</th>
			<th>Discount</th>
			<th>V-Margin</th>
			<th>R-Value</th>
			<th>Quantity</th>
            <th>Status</th>
        </tr>
    </thead>
    <tbody>
       <c:forEach items="${itemListObj}" var="itemObj">
       <tr>
            <th scope="row">1</th>
            <td><c:out value="${itemObj.itemName}"/></td>
			<td><c:out value="${itemObj.itemType}"/></td>
			<td><c:out value="${itemObj.itemSubType}"/></td>
			<td><c:out value="${itemObj.itemBrand}"/></td>
			<td><c:out value="${itemObj.itemMrp}"/></td>
			<td><c:out value="${itemObj.transactinDateAndTime}"/></td>
			<td><c:out value="${itemObj.marginDiscount}"/></td>
			<td><c:out value="${itemObj.rebateValue}"/></td>
			<td><c:out value="${itemObj.avaliableQuantity}"/></td>
			<td><c:out value="${itemObj.status}"/></td>				
	   </c:forEach>
    </tbody>
</table>
	<br><br>
	<%@include file="sellsFooter.jsp" %>